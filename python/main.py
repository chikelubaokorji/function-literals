if __name__ == "__main__":
    url_list = ["HTTPS://GOLANG.ORG",
                "HTTPS://SCALA-LANG.ORG",
                "HTTPS://JAVA.COM",
                "HTTPS://PYTHON.ORG",
                "HTTPS://ISOCPP.ORG"]

    # Function literal
    func_lit = lambda url: url.casefold()

    # Array traversing technique
    new_url_list = map(func_lit, url_list)

    print(list(new_url_list))
