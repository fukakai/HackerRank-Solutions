#
# Author: Romain DALICHAMP
# Github: https://github.com/fukakai
# Portfolio: http://romain.dalichamp.fr
# Contact: romain.dalichamp@free.fr
#
read X
read Y
read Z
#if all the sides have different size
if [ "$X" -ne "$Y" ] && [ "$X" -ne "$Z" ] && [ "$Y" -ne "$Z" ]; then
    echo "SCALENE"
fi
#Isoceles, if two sides ar equals only
if ([ "$X" -eq "$Y" ] && [ "$Y" -ne "$Z" ]) || ([ "$Y" -eq "$Z" ] && [ "$Z" -ne "$X" ]) || ([ "$X" -eq "$Z" ] && [ "$Y" -ne "$Z" ]); then
    echo "ISOSCELES"
fi
# equilateral, if all the sides are equals
if [ "$X" -eq "$Y" ] && [ "$Y" = "$Z" ]; then
    echo "EQUILATERAL"
fi