#
# Author: Romain DALICHAMP
# Github: https://github.com/fukakai
# Portfolio: http://romain.dalichamp.fr
# Contact: romain.dalichamp@free.fr
#
#!/bin/bash
read char

#Input Char to UpperCase
charToUpper="${char^}"

#using "" around $charToUpper to protect script encounters a syntax error (if empty)
if [ "$charToUpper" = "N" ]; then 
    echo "NO"
fi
if [ "$charToUpper" = "Y" ]; then 
    echo "YES"
fi