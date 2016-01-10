args.foreach(arg => println(arg))

// type 명시
args.foreach( (arg: String) => println(arg) )

// 부분 적용 함수
args.foreach(println)
