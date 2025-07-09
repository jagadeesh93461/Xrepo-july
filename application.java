# write_file.py
file = open("example.txt", "w")  # "w" = write mode
file.write("Hello, this is a simple file example.\n")
file.write("Python makes file handling easy!")
file.close()
print("File written successfully.")
# code changed by feature222
# read_file.py
file = open("example.txt", "r")  # "r" = read mode
content = file.read()
print("File content:")
print(content)
file.close()
# end with feature222