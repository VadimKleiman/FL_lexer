CC = g++
CFLAGS := -std=c++11 $(if $(TEST),-DTEST)
all:
	flex lex.l && $(CC) $(CFLAGS) test.cpp lex.yy.c -o main -ll
clean:
	rm main lex.yy.c
