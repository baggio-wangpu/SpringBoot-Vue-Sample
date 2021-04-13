module.exports = {
    devServer: {
        port: 8088,
        proxy: {
            '^/api': {
                target: 'http://localhost:8080',
                pathRewrite: {'^/api': ''}
            }
        }
    }
};