default:
	make build && make run

run:
	java -classpath "./bin:lib/mpxj.jar:lib/poi.jar:lib/tools.jar" Parse

build:
	javac -d "./bin" -classpath "lib/mpxj.jar:lib/poi.jar:lib/tools.jar" Parse.java

clean:
	rm bin/*
