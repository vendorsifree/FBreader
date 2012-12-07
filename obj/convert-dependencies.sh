#!/bin/sh
# AUTO-GENERATED FILE, DO NOT EDIT!
if [ -f $1.org ]; then
  sed -e 's!^C:/cygwin/lib!/usr/lib!ig;s! C:/cygwin/lib! /usr/lib!ig;s!^C:/cygwin/bin!/usr/bin!ig;s! C:/cygwin/bin! /usr/bin!ig;s!^C:/cygwin/!/!ig;s! C:/cygwin/! /!ig;s!^X:!/cygdrive/x!ig;s! X:! /cygdrive/x!ig;s!^R:!/cygdrive/r!ig;s! R:! /cygdrive/r!ig;s!^H:!/cygdrive/h!ig;s! H:! /cygdrive/h!ig;s!^C:!/cygdrive/c!ig;s! C:! /cygdrive/c!ig;s!^B:!/cygdrive/b!ig;s! B:! /cygdrive/b!ig;' $1.org > $1 && rm -f $1.org
fi
