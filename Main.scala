object Main {
	def main(args: Array[String]) {
		val myCounter = new Counter
		myCounter.increment()
		println(myCounter.current)
	}
}