# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.17

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Disable VCS-based implicit rules.
% : %,v


# Disable VCS-based implicit rules.
% : RCS/%


# Disable VCS-based implicit rules.
% : RCS/%,v


# Disable VCS-based implicit rules.
% : SCCS/s.%


# Disable VCS-based implicit rules.
% : s.%


.SUFFIXES: .hpux_make_needs_suffix_list


# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = "C:\Program Files\JetBrains\CLion 2020.2.4\bin\cmake\win\bin\cmake.exe"

# The command to remove a file.
RM = "C:\Program Files\JetBrains\CLion 2020.2.4\bin\cmake\win\bin\cmake.exe" -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = C:\Users\zzong\CLionProjects\coding-problems-study\C++Project

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = C:\Users\zzong\CLionProjects\coding-problems-study\C++Project\cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/C__Project.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/C__Project.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/C__Project.dir/flags.make

CMakeFiles/C__Project.dir/main.cpp.obj: CMakeFiles/C__Project.dir/flags.make
CMakeFiles/C__Project.dir/main.cpp.obj: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=C:\Users\zzong\CLionProjects\coding-problems-study\C++Project\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/C__Project.dir/main.cpp.obj"
	C:\PROGRA~2\MINGW-~1\I686-8~1.0-P\mingw32\bin\G__~1.EXE  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\C__Project.dir\main.cpp.obj -c C:\Users\zzong\CLionProjects\coding-problems-study\C++Project\main.cpp

CMakeFiles/C__Project.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/C__Project.dir/main.cpp.i"
	C:\PROGRA~2\MINGW-~1\I686-8~1.0-P\mingw32\bin\G__~1.EXE $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E C:\Users\zzong\CLionProjects\coding-problems-study\C++Project\main.cpp > CMakeFiles\C__Project.dir\main.cpp.i

CMakeFiles/C__Project.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/C__Project.dir/main.cpp.s"
	C:\PROGRA~2\MINGW-~1\I686-8~1.0-P\mingw32\bin\G__~1.EXE $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S C:\Users\zzong\CLionProjects\coding-problems-study\C++Project\main.cpp -o CMakeFiles\C__Project.dir\main.cpp.s

# Object files for target C__Project
C__Project_OBJECTS = \
"CMakeFiles/C__Project.dir/main.cpp.obj"

# External object files for target C__Project
C__Project_EXTERNAL_OBJECTS =

C__Project.exe: CMakeFiles/C__Project.dir/main.cpp.obj
C__Project.exe: CMakeFiles/C__Project.dir/build.make
C__Project.exe: CMakeFiles/C__Project.dir/linklibs.rsp
C__Project.exe: CMakeFiles/C__Project.dir/objects1.rsp
C__Project.exe: CMakeFiles/C__Project.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=C:\Users\zzong\CLionProjects\coding-problems-study\C++Project\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable C__Project.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\C__Project.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/C__Project.dir/build: C__Project.exe

.PHONY : CMakeFiles/C__Project.dir/build

CMakeFiles/C__Project.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\C__Project.dir\cmake_clean.cmake
.PHONY : CMakeFiles/C__Project.dir/clean

CMakeFiles/C__Project.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" C:\Users\zzong\CLionProjects\coding-problems-study\C++Project C:\Users\zzong\CLionProjects\coding-problems-study\C++Project C:\Users\zzong\CLionProjects\coding-problems-study\C++Project\cmake-build-debug C:\Users\zzong\CLionProjects\coding-problems-study\C++Project\cmake-build-debug C:\Users\zzong\CLionProjects\coding-problems-study\C++Project\cmake-build-debug\CMakeFiles\C__Project.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/C__Project.dir/depend

