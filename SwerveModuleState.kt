class SwerveModuleState(private val speed:Double, private val rotation2D: Rotation2D) {
    fun getSpeed():Double{
        return speed
    }
    fun getRotation():Rotation2D{
        return rotation2D
    }
}