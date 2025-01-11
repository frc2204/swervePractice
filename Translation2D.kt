class Translation2D(val x:Double, val y:Double) {
    fun toChassissSpeeds():ChassisSpeeds{
        return ChassisSpeeds(x,y)
    }
}