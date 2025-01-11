object Arm {



   enum class Position(
        val elbowPosition:Double,
        val wristPosition:Double,)
    {

        IntakePosition(0.1,0.2),
        ShootPosition(0.4,0.5),
        HomePosition(0.3,0.7)
    }

}


