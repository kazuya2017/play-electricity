package net.svil.bootcamp.electricity.Models

//class Plan(val flatRate:Long){

sealed abstract class Plan(name:String)

case class FlatRatePlan(name:String, basicCharge:Int, rate:Double) extends Plan(name)


