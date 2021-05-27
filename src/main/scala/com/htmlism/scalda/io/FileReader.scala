package com.htmlism.scalda.io

trait FileReader[F[_]] {
  def read(path: String): F[String]
}
