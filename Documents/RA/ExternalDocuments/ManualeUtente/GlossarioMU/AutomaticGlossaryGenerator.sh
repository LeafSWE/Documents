#!/bin/bash
#echo "This script require pdftk package becuse of a latex command that cannot be redefined..."
perl glossario.pl
perl searchAndReplace.pl ../sections/Applicazione.tex
perl searchAndReplace.pl ../sections/Installazione.tex
perl searchAndReplace.pl ../sections/Introduzione.tex
perl searchAndReplace.pl ../sections/PerIniziare.tex
perl searchAndReplace.pl ../sections/Panoramica.tex
perl searchAndReplace.pl ../sections/Requisiti.tex
