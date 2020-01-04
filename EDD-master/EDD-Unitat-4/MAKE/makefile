CC=gcc
CFLAGS=-Wall -g

.PHONY: dist
dist: clean calculadora
	rm -rf ../dist;
	mkdir -p ../dist/usr/bin/calculadora
	cp calculadora ../dist/usr/bin/calculadora

.PHONY: targz
targz: clean
	mkdir -p source
	cp *.c *.h Makefile source
	tar -cvf calculadora.tar source
	gzip calculadora.tar
	rm -rf calculadora.tar
	rm -rf source

install: dist
	cp -r ../dist/* /

calc.o: calc.c MEUCALC.h
	$(CC) $(CFLAGS) -c calc.c -o calc.o
.PHONY: clean

calculadora: calculadora.c calc.o
	$(CC) $(CFLAGS) calculadora.c calc.o -o calculadora

clean:
	rm -rf *.o


