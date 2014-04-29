./clean
shopt -s globstar
mkdir bin
mkdir bin/classes
javac -cp libs/commons-cli-1.2.jar -d bin/classes **/*.java
jar -cfm bin/app.jar ./src/resources/manifest.txt -C bin/classes .

mkdir dist
mkdir dist/bin
cp -R bin/app.jar dist/bin 
cp -R libs dist 
cp src/resources/run dist

