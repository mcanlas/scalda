package com.htmlism.scalda.io

trait FileWriter[F[_]]:
  def write(path: String, body: String): F[Unit]
