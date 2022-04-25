#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))
    arrFinal=[]
    for i in range (n-1,-1,-1):
        arrFinal.append(arr[i])
        
    for i in range (n):
        print (arrFinal[i], end=" ")
