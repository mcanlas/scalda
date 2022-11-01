package com.htmlism.scalda.io

import better.files.Dsl._
import better.files.File
import cats.effect._
import cats.syntax.all._

class BetterFilesFileReaderWriter[F[_]](implicit F: Sync[F]) extends FileReader[F] with FileWriter[F]:
  def read(path: String): F[String] =
    F.delay {
      File(path).!
    }

  def write(path: String, body: String): F[Unit] =
    F.delay {
      File(path) < body
    }.void
