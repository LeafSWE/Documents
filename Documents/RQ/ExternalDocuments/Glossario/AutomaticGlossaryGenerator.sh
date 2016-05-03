#!/bin/bash
#echo "This script require pdftk package becuse of a latex command that cannot be redefined..."
echo "glossario.pl compiling:"
perl glossario.pl
echo "Latex compiling could take long time..."
{
	pdflatex Glossario.tex
	makeglossaries Glossario
	pdflatex Glossario
	pdflatex Glossario
	pdflatex Glossario
	rm Glossario.aux
	rm Glossario.glo
	rm Glossario.glg
	rm Glossario.gls
	rm Glossario.ist
	rm Glossario.log
	rm Glossario.out
	rm Glossario.toc
} &> /dev/null
#pdftk Glossario.pdf cat 1-8 10-end output Glossario2.pdf
#rm Glossario.pdf
#mv Glossario2.pdf Glossario.pdf
echo "Done!"
