FROM node:10 as node-build

WORKDIR /build

COPY . .

RUN ["npm", "install"]

EXPOSE 3000

ENTRYPOINT  ["npm", "start"]