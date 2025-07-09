# write_file.py
file = open("example.txt", "w")  # "w" = write mode
file.write("Hello, this is a simple file example.\n")
file.write("Python makes file handling easy!")
file.close()
print("File written successfully.")
# cide changed by feature223
# delete_file.py
import os

if os.path.exists("example.txt"):
    os.remove("example.txt")
    print("File deleted successfully.")
else:
    print("File does not exist.")
# code end by feature223