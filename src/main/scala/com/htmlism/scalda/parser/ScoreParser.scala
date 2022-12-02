package com.htmlism.scalda.parser

import atto.Atto._
//import cats.syntax.all._

object ScoreParser extends App:
  val inputScore =
    """piano:
      |  o3
      |  g8 a b > c d e f+ g | a b > c d e f+ g4
      |  g8 f+ e d c < b a g | f+ e d c < b a g4
      |  << g1/>g/>g/b/>d/g""".stripMargin

  val octave =
    char('o') ~ int

  val noteLetter =
    char('a') | char('b') | char('c') | char('d') | char('e') | char('f') | char('g')

  val noteLength =
    int

  val accidental =
    char('-') | char('+')

  val note =
    for {
      let <- noteLetter
      len <- opt(noteLength)
      acc <- opt(accidental)
    } yield let.toString + len.map(_.toString).getOrElse("") + acc.map(_.toString).getOrElse("")

  val octaveChange =
    char('<') | char('>')

  val barLine =
    char('|')

  val noteEvent: atto.Parser[Any] =
    octave | note | many1(octaveChange) | barLine

  val instrumentLabel =
    stringOf(letter) <~ char(':')

  val oneLine =
    many1(many1(spaceChar) ~> noteEvent)

  val multiLine =
    many(char('\n') ~> oneLine)

  val score =
    for {
      ins <- instrumentLabel
      xs  <- oneLine | multiLine
    } yield (ins, xs)

  println {
    score
      .parseOnly(inputScore)
  }
