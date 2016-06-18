#!/bin/bash
i=$(ls -t | head -n1)
basename=${i%.*}
echo "Exporting from $i to $basename.png..."
sh /usr/lib/astah_professional/astah-command.sh -image all -f $i -t png -o . $basename.png
mv ./$basename/*.png ./$basename.png
rm -rf $basename
echo "Done!"
