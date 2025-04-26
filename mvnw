#!/usr/bin/env sh

# Maven Wrapper script for Unix-based systems

# Exit immediately if a command exits with a non-zero status
set -e

# Determine the directory of the script
DIR="$(cd "$(dirname "$0")" && pwd)"

# Execute the Maven command with the provided arguments
exec "$DIR"/.mvn/wrapper/maven-wrapper.jar "$@"