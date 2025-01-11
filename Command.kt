interface Command {
    var isFinished:Boolean
    fun initialize()
    fun periodic()
    fun finished()
}