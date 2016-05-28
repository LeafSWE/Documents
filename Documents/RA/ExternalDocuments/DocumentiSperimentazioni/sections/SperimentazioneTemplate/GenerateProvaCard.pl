use strict;
use warnings;
     
my $filename = 'SperimentazioneAutomatic.tex';
open(my $fh, '>', $filename) or die "Could not open file '$filename' $!";

	my $firstTime = 1;
	my $i = 0;

while($i<30) {

	if($firstTime) {
		print $fh '\documentclass[../Sperimentazione.tex]{subfiles}

\begin{document}

\section{Sperimentazione}

	\subsection{Configurazione dispositivi di prova}
	
		\subsubsection{Dispositivo 1}
			
		
		\subsubsection{Dispositivo 2}
		
		% variabili dispositivi
		\newcommand{\dispositivoA}{???}
		\newcommand{\dispositivoB}{???}
		
	\newpage
	\subsection{Prove effettuate}';
	
		$firstTime = 0;
	}

	print $fh '
	\newpage	
			\paragraph*{}
			\label{Prova???}
			\begin{tcolorbox}[fonttitle=\bfseries, 
								adjusted title={\Large Prova ???}, 
								breakable, 
								sharp corners=south,
								colback=white, 
								colframe=white!60!black]
								
				\begin{description}[leftmargin=0.7cm,labelwidth=!]
				
					\item[Input] \ \par 
        				\begin{itemize}
        					\item \verb|$???| = ???
							\item \verb|$???| = ???
							\item \verb|$???| = ???
							% ???;
        					\item \verb|$???| = ???
        				\end{itemize}
        				
        			\tcbline 
        				
        			\item[Output atteso] \ \par
        				\begin{itemize}
        					\item \verb|$RESULT| = ???
        				\end{itemize}

					\tcbline        				
        				
        			\item[Output riscontrato] \ \par
        				\begin{description}
        				
        					\item[\dispositivoA] \ \par
        					\begin{itemize}
        						\item \verb|$RESULT| = \ok
        					\end{itemize}      					
        					
        					\item[\dispositivoB] \ \par
        					\begin{itemize}
        						\item \verb|$RESULT| = \ok
        					\end{itemize}
        					
        				\end{description}
        				
        			\tcbline
        			
        			\item[Analisi risultati] \ \par
        				\begin{description}
        					\item[Considerazioni] \ \par
        						???.
        					
        					\item[Possibili miglioramenti] \ \par 
        						???.
        				\end{description}
        				
				\end{description}  
				
			\end{tcolorbox}



	';
	
	$i++;
}

print $fh '\end{document}';

close $fh;
print "done\n";