#ifndef DATA_H_
#define DATA_H_

#include <stdio.h>
#include <iostream>
#include <string>

class base
{
public:
	virtual void print() = 0;
	virtual std::string toString() = 0;
};

typedef enum {
	KW_READ,
	KW_IF,
	KW_THEN,
	KW_ELSE,
	KW_WRITE,
	KW_BEGIN,
	KW_END,
	KW_WHILE,
	KW_DO,
} kw_type;


class key_word : public base {
private:
	kw_type 		type;
	unsigned int	current_line;
	unsigned int	current_pos;
	unsigned int	offset;
public:
	key_word(kw_type type, unsigned int current_line, unsigned int current_pos, unsigned int offset)
		: type(type)
		, current_line(current_line)
		, current_pos(current_pos)
		, offset(offset)
	{
	}
	void print() {
		std::cout << toString();
	}
	std::string toString() {
		std::string out;
		switch(type)
    	{
        	case KW_READ:   out += "KW_READ";      break;
        	case KW_IF:     out += "KW_IF";        break;
        	case KW_THEN:   out += "KW_THEN";      break;
        	case KW_ELSE:   out += "KW_ELSE";      break;
        	case KW_WRITE:  out += "KW_WRITE";     break;
        	case KW_BEGIN:  out += "KW_BEGIN";     break;
        	case KW_END:    out += "KW_END";       break;
        	case KW_WHILE:  out += "KW_WHILE";     break;
        	case KW_DO:     out += "KW_DO";        break; 
        	default:	break;
    	}
		out += "(" + std::to_string(current_line) + ", " + std::to_string(current_pos) + ", " + std::to_string(current_pos + offset) + ");";
		return out;
	}
};

class ident : public base {
private:
	std::string		name;
	unsigned int	current_line;
	unsigned int	current_pos;
	unsigned int	offset;
public:
	ident(const std::string& name, unsigned int current_line, unsigned int current_pos, unsigned int offset)
		: name(name)
		, current_line(current_line)
		, current_pos(current_pos)
		, offset(offset)
	{
	}
	void print() {
		std::cout << toString();
	}
	std::string toString() {
		std::string out;
		out += "IDENT(" + name + ", " + std::to_string(current_line) + ", " + std::to_string(current_pos) + ", " + std::to_string(current_pos + offset) + ");";
		return out;
	}
};

typedef enum {
	EQ,
	L,
	G,
	LE,
	GE,
	NE,
	ADD,
	SUB,
	MUL,
	DIV,
	MOD,
	AND,
	OR,
	POW,
	ASSIGN
} op_type;

class op : public base {
private:
	op_type 		type;
	unsigned int    current_line;
    unsigned int    current_pos;
    unsigned int    offset;
public:
	op(op_type type, unsigned int current_line, unsigned int current_pos, unsigned int offset)
		: type(type)
		, current_line(current_line)
		, current_pos(current_pos)
		, offset(offset)
	{
	}
	void print() {
		std::cout << toString();
	}
	std::string toString() {
		std::string out;
		out += "OP(";
		switch(type) {
			case EQ:	out +=  "EQ";	break;
			case L: 	out +=  "L";	break;
			case G:		out +=  "G";	break;
			case LE:	out +=  "LE";	break;
			case GE:	out +=  "GE";	break;
			case NE:	out +=  "NE";	break;
			case ADD:	out +=  "ADD";	break;
			case SUB:	out +=  "SUB";	break;
			case MUL:	out +=  "MUL";	break;
			case DIV:	out +=  "DIV";	break;
			case MOD:	out +=  "MOD";	break;
			case AND:	out +=  "AND";	break;
			case OR:	out +=  "OR";	break;
			case POW:	out +=  "POW";	break;
			case ASSIGN:	out += "ASSIGN"; break;
			default:	break;
		}
		out += ", " + std::to_string(current_line) + ", " + std::to_string(current_pos) + ", " + std::to_string(current_pos + offset) + ");";
		return out;
	}
};

class value : public base {
private:
	std::string 	val;
	unsigned int    current_line;
    unsigned int    current_pos;
    unsigned int    offset;
public:
	value(const std::string& val, unsigned int current_line, unsigned int current_pos, unsigned int offset)
		: val(val)
		, current_line(current_line)
		, current_pos(current_pos)
		, offset(offset)
	{
	}
	void print() {
		std::cout << toString();
	}
	std::string toString() {
		std::string out;
		out += "VALUE(" + val + ", " + std::to_string(current_line) + ", " + std::to_string(current_pos) + ", " + std::to_string(current_pos + offset) + ");";
		return out;
	}
	
};

class separator : public base {
private:
	unsigned int    current_line;
    unsigned int    current_pos;
    unsigned int    offset;
public:
	separator(unsigned int current_line, unsigned int current_pos, unsigned int offset)
		: current_line(current_line)
		, current_pos(current_pos)
		, offset(offset)
	{
	}
	void print() {
		std::cout << toString();
    }
	
	std::string toString() {
		std::string out;
		out += "SEPARATOR(" + std::to_string(current_line) + ", " + std::to_string(current_pos) + ", " + std::to_string(current_pos + offset) + ");";
		return out;
	}
};

class comment : public base {
private:
    std::string 	comm;
    unsigned int    current_line;
    unsigned int    current_pos;
    unsigned int    offset;
public:
	comment(const std::string& comm, unsigned int current_line, unsigned int current_pos, unsigned int offset)
		: comm(comm)
		, current_line(current_line)
		, current_pos(current_pos)
		, offset(offset)
	{
	}
	void print() {
		std::cout << toString();
    }
	
	std::string toString() {
		std::string out;
		out += "COMMENT(" + comm + ", " + std::to_string(current_line) + ", " + std::to_string(current_pos) + ", " + std::to_string(current_pos + offset) + ");";
		return out;
	}
};

class mlcomment : public base {
private:
	std::string comm;
	unsigned int    start_line;
    unsigned int    start_pos;
	unsigned int    end_line;
    unsigned int    end_pos;
public:
	mlcomment(const std::string& comm, unsigned int start_line, unsigned int start_pos, unsigned int end_line, unsigned int end_pos)
			: comm(comm)
			, start_line(start_line)
			, start_pos(start_pos)
			, end_line(end_line)
			, end_pos(end_pos)
		{
		}
	void print() {
		std::cout << toString();
	}
	
	std::string toString() {
		std::string out;
		out += "ML_COMMENT(" + comm + ", " + std::to_string(start_line) + ", " + std::to_string(start_pos) + ", " + std::to_string(end_line) + ", " + std::to_string(end_pos) + ");";
		return out;
	}

};

#endif //DATA_H_