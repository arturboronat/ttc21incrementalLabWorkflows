# syntax=docker/dockerfile:1
FROM gradle:7.0.2-jdk11

WORKDIR /yamtl_ttc2021
COPY . .
CMD python3 --version && python3 ./scripts/run.py && cat ./output/output.csv | sed 's/;/,/g'