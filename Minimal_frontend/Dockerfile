FROM nginx:alpine

RUN echo 'server { \
    listen 80; \
    location / { \
        root /usr/share/nginx/html; \
        index index.html; \
    } \
    location /rest/ { \
        proxy_pass http://backend:8080/rest/; \
        proxy_set_header Host $host; \
    } \
}' > /etc/nginx/conf.d/default.conf

COPY . /usr/share/nginx/html
EXPOSE 80