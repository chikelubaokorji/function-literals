package main

import (
	"fmt"
	"strings"
)

func main() {
	var urlArray = []string{"HTTPS://GOLANG.ORG",
		"HTTPS://SCALA-LANG.ORG",
		"HTTPS://JAVA.COM",
		"HTTPS://PYTHON.ORG",
		"HTTPS://ISOCPP.ORG"}

	var newUrlArray []string

	// Function literal
	funcLit := func(url string) string { return strings.ToLower(url) }

	// Array traversing technique (Apparently the "for" keyword cannot be avoided in Go)
	for _, url := range urlArray {
		newUrlArray = append(newUrlArray, funcLit(url))
	}

	fmt.Println(newUrlArray)
}
