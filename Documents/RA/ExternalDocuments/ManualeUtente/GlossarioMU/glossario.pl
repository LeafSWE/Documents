#!/usr/bin/perl -w
use XML::LibXML;
use strict;
use utf8;
#\\sectionfont{\\fontsize{0}{0}\\selectfont}
#\\item\\makebox[\\linewidth]{\\Large\\textbf{\\glsgetgrouptitle{##1}}}%
my $file = "Glossario.xml";
my $parser=XML::LibXML->new();                      #creazione del parser
my $doc=$parser->parse_file($file) || die("file non trovato \n");   #parsing del file
my $root=$doc->getDocumentElement;                  #estrazione radice
my @voci = $root->getElementsByTagName("voce");
my $newfile;	
foreach my $voce (@voci) {
    my $termine = $voce->findvalue("termine");
    $termine =~ s/^\s+|\s+$//g;
    $termine = ucfirst($termine);
    my $descrizione = $voce->findvalue("descrizione");
    $descrizione =~ s/^\s+|\s+$//g;
    $descrizione = ucfirst($descrizione);
    $newfile = $newfile."\\newglossaryentry{$termine}{name=$termine,description={$descrizione}}\n";
}

$file = "glos.tex";
open(OUT, ">$file");                            #apertura file 
print OUT $newfile;                       #serializzazione + salvataggio
close(OUT);
