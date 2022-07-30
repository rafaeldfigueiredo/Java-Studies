import json

potentialGuests = open("./potentialGuests.json","r")
guestList = open("guests.txt","r")

json.dump(potentialGuests, guestList)