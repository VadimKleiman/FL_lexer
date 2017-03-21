%{
#include <vector>
#include <string>
#include <iostream>
#include "data.h"

using namespace std;

unsigned int current_line_number = 0;
unsigned int current_pos = 0;
vector<base*> tokens;

void succ_current_pos(unsigned int mult)
{
	current_pos += strlen(yytext) * mult;
}
void clear_current_pos() {
	current_line_number = current_pos = 0;
}

%}

%%
read 	{ key_word* kw = new key_word(KW_READ, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(kw);
		succ_current_pos(1);
		}
[ ]+	succ_current_pos(1);
[\t]+	succ_current_pos(4);
(\n\r)|\n|\r	{current_pos = 0;
				++current_line_number;
				}
if	{key_word* kw = new key_word(KW_IF, current_line_number, current_pos, strlen(yytext) - 1);
	tokens.push_back(kw);
	succ_current_pos(1);
	}
then	{key_word* kw = new key_word(KW_THEN, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(kw);
		succ_current_pos(1);
		}
else	{key_word* kw = new key_word(KW_ELSE, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(kw);
		succ_current_pos(1);
		}
write	{key_word* kw = new key_word(KW_WRITE, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(kw);
		succ_current_pos(1);
		}
begin	{key_word* kw = new key_word(KW_BEGIN, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(kw);
		succ_current_pos(1);
		}
end		{key_word* kw = new key_word(KW_END, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(kw);
		succ_current_pos(1);
		}
while	{key_word* kw = new key_word(KW_WHILE, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(kw);
		succ_current_pos(1);
		}
do		{key_word* kw = new key_word(KW_DO, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(kw);
		succ_current_pos(1);
		}
"//"[^\n]+	{comment* cm = new comment(string(yytext), current_line_number, current_pos, strlen(yytext) - 1);
			tokens.push_back(cm);
			succ_current_pos(1);
			}
(-?(([0-9]+)|([0-9]*\.[0-9]+)([eE][-+]?[0-9]+)?))|true|false	{value* vl = new value(string(yytext), current_line_number, current_pos, strlen(yytext) - 1);
																tokens.push_back(vl);
																succ_current_pos(1);
																}
[a-zA-Z_][a-zA-Z0-9_]*	{ident* id = new ident(string(yytext), current_line_number, current_pos, strlen(yytext) - 1);
						tokens.push_back(id);
						succ_current_pos(1);
						}
[();]	{separator* sep = new separator(current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(sep);
		succ_current_pos(1);
		}
"+"		{
		op* oprt = new op(ADD, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(oprt);
		succ_current_pos(1);
		}
"-"		{op* oprt = new op(SUB, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(oprt);
		succ_current_pos(1);
		}
"/"		{op* oprt = new op(DIV, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(oprt);
		succ_current_pos(1);
		}
"%"		{op* oprt = new op(MOD, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(oprt);
		succ_current_pos(1);
		}
"*"		{op* oprt = new op(MUL, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(oprt);
		succ_current_pos(1);
		}
"=="	{op* oprt = new op(EQ, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(oprt);
		succ_current_pos(1);
		}
"!="	{op* oprt = new op(NE, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(oprt);
		succ_current_pos(1);
		}
"<="	{op* oprt = new op(LE, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(oprt);
		succ_current_pos(1);
		}
">="	{op* oprt = new op(GE, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(oprt);
		succ_current_pos(1);
		}
">"		{op* oprt = new op(G, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(oprt);
		succ_current_pos(1);
		}
"<"		{op* oprt = new op(L, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(oprt);
		succ_current_pos(1);
		}
"&&"	{op* oprt = new op(AND, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(oprt);
		succ_current_pos(1);
		}
"||"	{op* oprt = new op(OR, current_line_number, current_pos, strlen(yytext) - 1);
		tokens.push_back(oprt);
		succ_current_pos(1);
		}
%%
void print(){
	for(const auto &i : tokens){
			i->print();
	}
	cout << endl;
}
#ifdef TEST
extern void test();
#endif
int main(int argc, char *argv[]) {
	#ifdef TEST
	test();
	#else
	if (argc == 2)
	{
		yyin = fopen(argv[1], "r");
		yylex();
		print();
		fclose(yyin);
	}
	else {
		yylex();
		print();
	}
	#endif
	return 0;
}