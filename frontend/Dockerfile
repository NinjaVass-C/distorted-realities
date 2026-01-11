# Use Node 24
FROM node:24 AS build

# Set working directory
WORKDIR /app

# Copy package files
COPY package*.json ./

# Install dependencies and fix rollup issue in container
RUN npm install

# Copy the rest of the source
COPY . .

# Expose container port for React dev server
EXPOSE 3000

# Pass backend URL from environment
ENV REACT_APP_BACKEND_URL=${REACT_APP_BACKEND_URL}

# Start React dev server
CMD ["npm", "run", "dev"]
