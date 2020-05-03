fun launchApplication(args: List<String>) {
  val identifier = args.single()

  val service = SpringBoardServices.open()
  try {
    service.launchApplicationWithIdentifier(identifier)
  } finally {
    service.close()
  }
}
