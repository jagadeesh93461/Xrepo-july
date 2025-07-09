# write_file.py
file = open("example.txt", "w")  # "w" = write mode
file.write("Hello, this is a simple file example.\n")
file.write("Python makes file handling easy!")
file.close()
print("File written successfully.")
