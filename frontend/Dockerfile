# Use a lightweight Node.js base image
FROM node:18-alpine

# Set the working directory
WORKDIR /app

# Copy package.json and package-lock.json (or yarn.lock)
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy the rest of the application code
COPY . .

# Expose the port where the React app listens (usually 3000)
EXPOSE 3000

# Start the React app in development mode (use production command for deployment)
CMD [ "npm", "start" ]
