package com.htmlism.scalda.dsl

sealed trait MusicEvent

object MusicEvent:
  trait OctaveEvent extends MusicEvent

  object OctaveEvent:
    case class SetOctave(n: Int) extends OctaveEvent

    case class MoveOctave(n: Int) extends OctaveEvent

  case class NoteEvent(note: NoteName, duration: Duration, sharps: Int, flats: Int) extends MusicEvent

  case class TiedDuration(left: Duration, right: Duration) extends MusicEvent

  case class RestEvent(duration: Duration) extends MusicEvent
