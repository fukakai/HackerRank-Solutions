#
# Author: Romain DALICHAMP
# Github: https://github.com/fukakai
# Portfolio: http://romain.dalichamp.fr
# Contact: romain.dalichamp@free.fr
#
read X
read Y
if (($X > $Y)); then 
    echo "X is greater than Y"
elif (($X == $Y)); then 
    echo "X is equal to Y" 
elif (($X < $Y)); then 
    echo "X is less than Y" 
fi