package org.knoldus.main.Traits

import org.knoldus.main.repo.Person

trait Ordered {
  val name:String
  val age:Int
  def <(person:Person): Boolean ={
    if(name == person.name){
      if(age < person.age) true
      else false
    }
    else{
      if(name.length < person.name.length) true
      else false
    }
  }
}
