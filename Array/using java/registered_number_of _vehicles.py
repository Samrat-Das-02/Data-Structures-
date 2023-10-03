from os import *
from sys import *
from collections import *
from math import *

def numberOfVehicles(districtCount, alpha1, alpha2, alpha3, alpha4, dig1, dig2, dig3, dig4):
    # Write your code here.
    print(districtCount)
    diff_1=ord(alpha2)-ord(alpha1)+1
    print(diff_1)
    diff_2=ord(alpha4)-ord(alpha3)+1
    print(diff_2)
    dig1+=1
    print(dig1)
    dig2+=1
    print(dig2)
    dig3+=1
    print(dig3)
    dig4+=1
    print(dig4)
    number_of_vehicles=(districtCount*diff_1*diff_2*dig1*dig2*dig3*dig4)
    return number_of_vehicles
r=numberOfVehicles(4,'A','C','B','D',5,4,3,4)
print(r)