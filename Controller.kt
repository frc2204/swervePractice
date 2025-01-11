class Controller {
    fun getTranslation2D():Translation2D{
        return Translation2D(1.0,2.0)
    }
    fun getDesiredArmPosition():Arm.Position{
        return Arm.Position.HomePosition
    }
    fun getDesiredElevatorPosition():Elevator.Position{
        return Elevator.Position
    }
}