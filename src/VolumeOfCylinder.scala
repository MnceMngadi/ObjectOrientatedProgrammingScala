trait VolumeOfCylinder extends Order {

  def calculateVolumOfCylinder(radius: Int, height: Int):Double={

    val volumeOfCylinder = (3.14*(radius*radius))*height
    return volumeOfCylinder
  }

}
