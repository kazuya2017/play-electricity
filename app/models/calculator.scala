package net.svil.bootcamp.electricity.Models

object Calculator{
  def accumelate(h: History, p: Plan): Long = {
    // TODO
    h.data.foldLeft(0L){ case (a, (k, v)) => a+v*p.flatRate}
  }
}
