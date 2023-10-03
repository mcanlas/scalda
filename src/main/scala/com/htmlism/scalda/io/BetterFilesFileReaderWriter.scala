package com.htmlism.scalda.io

import better.files.Dsl.*
import better.files.File
import cats.effect.*
import cats.syntax.all.*

class BetterFilesFileReaderWriter[F[_]](implicit F: Sync[F]) extends FileReader[F] with FileWriter[F]:
  def read(path: String): F[String] =
    F.delay:
      File(path).!

  def write(path: String, body: String): F[Unit] =
    F.delay {
      File(path) < body
    }.void
