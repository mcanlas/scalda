package com.htmlism.scalda

import scala.language.postfixOps

package object dsl:
  val a: NoteOps = ???
  val b: NoteOps = ???
  val c: NoteOps = ???
  val d: NoteOps = ???
  val e: NoteOps = ???
  val f: NoteOps = ???
  val g: NoteOps = ???

  val o: OctaveOps = ???

  List(a +, b +, c -, d -, o <, o >, a / b / c)

  implicit class DurationOps(n: Int)
