trait Order {

  def costPerUnitVolume(volume: Double, costPerUnit: Double): Unit ={

    return volume * costPerUnit

  }

}
