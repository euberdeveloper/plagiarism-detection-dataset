#!/bin/bash

# Array of file names
files=(
    "AnonymousVariables.java"
    "CLI.java"
    "Compact.java"
    "IfElse.java"
    "IfElseIf.java"
    "IfIf.java"
    "IfWithBraces.java"
    "IfWithoutBraces.java"
    "PatternMatching.java"
    "PatternMatchingManual.java"
    "StringConcat.java"
    "StringTemplate.java"
    "Try.java"
    "TryWithResource.java"
    "Verbose.java"
)

# Create directories and move files
for file in "${files[@]}"; do
    # Extract the file name without extension
    filename=$(basename "$file")
    filename_no_ext="${filename%.*}"
    
    # Create directories if they don't exist
    mkdir -p "${filename_no_ext}/copy-pasted"
    mkdir -p "${filename_no_ext}/original"
    
    # Move the file to the appropriate directory
    cp "$file" "${filename_no_ext}/copy-pasted/${filename}"
    cp "$file" "${filename_no_ext}/original/${filename}"
done
