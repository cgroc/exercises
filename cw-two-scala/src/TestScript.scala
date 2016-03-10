/**
  * Created by chris on 26/02/2016.
  */
object TestScript extends App {
  val cc = new CodeController(new CodeImpl(4))
  //println(cc.SIZE_OF_CODE)
  println(cc.code)

  val ui = new TextUI
  val guess = new Guess(Vector(Blue(), Blue()))
  val feedback = new Feedback(Vector(Black()))
  val testFeedBack = Array[(Guess, Feedback)]((guess, feedback), null, null)
  ui.greet()
  ui.promptForGuess(2)
  ui.showFeedback(testFeedBack, 2)


}
