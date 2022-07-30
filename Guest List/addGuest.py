f = open("guests.txt","a")
guest = input('Tell me a name:\n>')
f.write(f"{guest}\n")
f.close()