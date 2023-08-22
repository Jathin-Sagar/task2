# Use the official PostgreSQL image as the base image
FROM postgres:latest

# Set environment variables for PostgreSQL
ENV POSTGRES_DB mydb
ENV POSTGRES_USER jathin
ENV POSTGRES_PASSWORD jathin

# Expose the default PostgreSQL port (5432)
EXPOSE 5432

# Copy custom initialization scripts to the container
# COPY init.sql /docker-entrypoint-initdb.d/

# This script will be executed on container startup to initialize the database
