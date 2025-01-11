class ElevatorSubsystem {
    val topMotor = Motor()
    val bottomMotor = Motor()
    fun getDesiredPosition(DesiredPosition:Elevator.Height){
        val topMotorVoltage = DesiredPosition.topMotorHeight
        topMotor.setControl(topMotorVoltage)
        val bottomMotorVoltage = DesiredPosition.bottomMotorHeight
        bottomMotor.setControl(bottomMotorVoltage)
    }
}